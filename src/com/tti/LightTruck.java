package com.tti;

// Takes functionality of Vehicle class and adds
// Towing capacity and Gross Combined Weight Truck Weight and is 4WD as parameters;
class LightTruck extends Vehicle {
        private int towingCapacity; //Decalres towingCapacity  in lbs. as integer
        private int grossCombinedWeight;//Declares grossCombinedWeight in lbs. as an integer
        private int truckWeight;//Declares Truck weight in lbs. as integer
        private boolean is4wd;//Declare is4wd as Boolean;

        /* Light truck Constructor Code block
           

         */
        public LightTruck(
         int wholesaleCost,
        int retailPrice,
        int modelYear,
        String make,
        String model,
        String color,
        String vin,
        String vehicleType,
        boolean isLeasable,
        int leaseTerm,
        int maxMilesPerYear,
        int towingCapacity,
        int grossCombinedWeight,
        int truckWeight,
        boolean is4wd) {
        super(wholesaleCost, retailPrice, modelYear, make, model, color, vin, vehicleType, isLeasable, leaseTerm, maxMilesPerYear);
        this.grossCombinedWeight = grossCombinedWeight;
        this.towingCapacity = towingCapacity;
        this.truckWeight = truckWeight;
        this.is4wd = is4wd;
    }
        /**
         * @return the towingCapacity
         */
        public int getTowingCapacity() {
                return towingCapacity;
        }


        /**
         * @param towingCapacity the towingCapacity to set
         */
        public void setTowingCapacity(int towingCapacity) {
                this.towingCapacity = towingCapacity;
        }


        /**
         * @return the grossCombinedWeight
         */
        public int getGrossCombinedWeight() {
                return grossCombinedWeight;
        }


        /**
         * @param grossCombinedWeight the grossCombinedWeight to set
         */
        public void setGrossCombinedWeight(int grossCombinedWeight) {
                this.grossCombinedWeight = grossCombinedWeight;
        }


        /**
         * @return the truckWeight
         */
        public int getTruckWeight() {
                return truckWeight;
        }


        /**
         * @param truckWeight the truckWeight to set
         */
        public void setTruckWeight(int truckWeight) {
                this.truckWeight = truckWeight;
        }


        /**
         * @return the is4wd
         */
        public boolean isIs4wd() {
                return is4wd;
        }


        /**
         * @param is4wd the is4wd to set
         */
        public void setIs4wd(boolean is4wd) {
                this.is4wd = is4wd;
        }
}


