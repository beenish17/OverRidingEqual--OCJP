
package overrideequality;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class OverRideEquality {
        private int age;
        private String name;
        
    public OverRideEquality(int age,String name){
        this.age=age;
        this.name=name;
    }
    //@Override : Lets creat an Over-riding equals method.
    public boolean equals(Object obj){
        //1: In first step compare refrence of two objects are equal if equal they will return True.
            if(this==obj)   return true;
        //2: If the obj will null it will return false
            if(obj==null)   return false;
        //3: If the classes of both the Objects will not match it will return false.
            if(this.getClass() != obj.getClass())   return false;
        //3: It is another way to check the type of an Object.
            if(!(obj instanceof OverRideEquality))
                return false;
        //4: Now Cast the obj in the given class.
            OverRideEquality cast=(OverRideEquality)obj;
            return this.age== cast.age;
        //5: If you want to check all the instance variables at the same time.
            //return EqualsBuilder.reflectionEquals(this,obj);
        }
    public static void main(String[] args) {
       OverRideEquality obj1=new OverRideEquality(27,"Beenish");
       OverRideEquality obj2=new OverRideEquality(27,"");
       System.out.println(obj1.equals(obj2));
    }
    
}
