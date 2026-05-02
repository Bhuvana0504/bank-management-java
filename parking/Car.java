package parking;
class Car{
    private String lic;
    private String col;
    Car(String lic,String col){
        this.lic=lic;
        this.col=col;
    }
    String getLic(){
        return  lic;
    }
    String getCol(){
        return col;
    }
}