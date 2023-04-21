class Point{
    private double xCoordinate;
    private double yCcoordinate;

    public Point(double xCoordinate, double yCcoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCcoordinate = yCcoordinate;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCcoordinate() {
        return yCcoordinate;
    }

    public void setyCcoordinate(double yCcoordinate) {
        this.yCcoordinate = yCcoordinate;
    }    

    public double distance(double yCcoordinate, double xCoordinate){
        double distance = Math.sqrt(Math.pow((yCcoordinate - this.yCcoordinate),
        2) + Math.pow((xCoordinate - this.xCoordinate), 2));
        return distance;
    }
}