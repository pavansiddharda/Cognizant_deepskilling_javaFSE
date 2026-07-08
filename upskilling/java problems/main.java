
class example{
   int rollno;
   String name;
   void display(){
       System.out.println(rollno + " " + name);
   }    
}
class main{
    public static void main(String[] args){
        example obj = new example();
        obj.rollno = 1;
        obj.name = "John";
        System.out.println("Roll No: " + obj.rollno);
        System.out.println("Name: " + obj.name);
        obj.display();
    }
}