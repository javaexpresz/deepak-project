package com.p1;
import java.util.HashSet;

import java.util.Set;

public class Test {

public static void main(String[] args) {

Set<Human> humans = new HashSet<Human>();

humans.add(new Human(13));

humans.add(new Human(190));

humans.add(new Human(190));

humans.add(new Human(21));

for(Human human:humans)

{

System.out.println(human+" "+human.hashCode());

}

}

}

class Human {

Integer age;

public Human(int age) {

this.age = age;

}

@Override

public String toString() {

return "Human [age=" + age + "]";

}

public boolean equals(Object obj)

{

return age.equals(((Human)obj).age);

}

public int hashCode()

{

return age;

}

}