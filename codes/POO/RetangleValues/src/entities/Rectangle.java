package entities;

public class Rectangle {

    public double height;
    public double width;


    // não recebe nenhum dado pois os dados já estão na classe
        public double AreaRet(){
            double area = height * width;
            return area;
        }
        
        public double DiagonalRet(){
           double diagonal = Math.sqrt((Math.pow(height,2) + Math.pow(width,2)));
            return diagonal;
        }
        public double PerimetroRet(){

            return height * 2.00 + width * 2.00;
        }

    
}
