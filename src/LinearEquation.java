public class LinearEquation {




    int x1;
    int y1;
    int x2;
    int y2;
    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }




    double distance(){
        return roundedToHundredth((Math.sqrt(Math.pow(((double)x2 - x1), 2) + Math.pow(((double)y2 - y1), 2))));
    }
    double yIntercept(){
        return (-(slope() * x1)) + y1;
    }
    double slope(){
        return roundedToHundredth(((double)y2 - y1) / ((double)x2 - x1));
    }
    String equation(){
        if(y1 == y2){
            return "y = " + yIntercept();
        }else {
            return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x" + " + " + yIntercept();
        }
    }
    String coordinateForX(double x){
        return "(" + x + ", " + ((slope() * x) + yIntercept()) + ")";
    }
    String lineInfo(){
        return  "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")" + "\nThe equation of the line between these points is: " + equation() + "\nThe y-intercept of this line is: " + yIntercept() + "\nThe slope of this line is: " + slope() + "\nThe distance between these points is: " + distance();
    }
    Double roundedToHundredth(double toRound){
        return Math.round(toRound * 100) / 100.0;
    }
}
