package com.Array.Operations;

/**
 * Created by aksingh on 24-04-2017.
 *
 * This needs rework and revisit
 */
public class GasStationTourCircle {

    private Integer startGasStation;
    private Integer endGasStation;
    private Integer gasStation;
    public GasStationTourCircle() {
    }

    public Integer findGasStation(Integer petrolArray[], Integer distanceArray[]){

        startGasStation = 0;
        endGasStation = 1;
        Integer totalPetrol = 0;
        Integer currentPetrol = 0;

        for(int i=0; i< petrolArray.length ; ++i){
            currentPetrol+=petrolArray[i]-distanceArray[i];
            if(currentPetrol<0){
                //totalPetrol+=currentPetrol;
                currentPetrol=0;
                startGasStation=i+1;
            }
            totalPetrol+=currentPetrol;
        }
        //totalPetrol+=currentPetrol;
        return totalPetrol<0?-1:startGasStation;
    }


    public static void main(String args[]){
        GasStationTourCircle gsc = new GasStationTourCircle();
        Integer[] petrolArray = {4, 6, 7, 4};
        Integer[] distanceArray = {6, 5, 3, 5};
        System.out.println(gsc.findGasStation(petrolArray, distanceArray));

    }
}
