public class student implements Comparable<student>{
    public int age;
    public String name;
    public int weight;

    //getter functions for each
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    //setter functions
    public void setAge(int age){
        this.age = age;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String toString(){
        return "Age: " + age + " Name: " + name + " Weight: " + weight;
    }

    //constructor
    public student(int age, String name, int weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(student that){
        //this method is called for current object
        
        //sort basis on age in ascending order, but if age is same then comare the letters
        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;

        //sort basis on age in descending order
        //return that.age - this.age;
    }

}
