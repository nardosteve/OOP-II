public class YearRange2 {

    //Variables
    int yearRangeFrom;
    int yearRangeTo;
    int rangeType;
    int firstDivisor;
    int secondDivisor;

    public YearRange2(int yrf, int yrt){
        yearRangeFrom = yrf;
        yearRangeTo = yrt;
    }

    public void setRangeType(int type){
        rangeType = type;
        switch(type){
            case 1:
                firstDivisor = 14;
                secondDivisor = 20;
                break;
            case 2:
                firstDivisor = 4;

                break;
            case 3:
                firstDivisor = 3;
                break;
        }
    }

    public int getFirstDivisor(){
        return firstDivisor;
    }

    public int getSecondDivisor(){
        return secondDivisor;
    }

    public int getFirstYear(){
        return yearRangeFrom;
    }

    public int getSecondYear(){
        return yearRangeTo;
    }

    public void printYears(){
        if(rangeType == 1){
            for(int i = yearRangeFrom; i <= yearRangeTo; i++){
                if(i % firstDivisor == 0 && i % secondDivisor == 0){
                    System.out.println(i);
                }

            }
        } else if(rangeType == 2){
            for(int i = yearRangeFrom; i <= yearRangeTo; i++){
                if(i % firstDivisor == 0){
                    System.out.println(i);
                }
            }
        } else if(rangeType == 3){
            for(int i = yearRangeFrom; i <= yearRangeTo; i++){
                if(i % firstDivisor == 0){
                    System.out.println(i);
                }
            }
        }
    }
}

