public class Rectangle {
   private int width;
    private int length;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int area(){
        return length*width;

    }
    public boolean isSquare(){
        if(length==width){
            return true;
        }else{
            return false;
        }
    }
}
