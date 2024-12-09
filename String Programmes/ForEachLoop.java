// String Program
// write a java program to print the sum and average by using for each loop

// foreach loop

class ForEachLoop{

public static void main(String args [ ]){

int nums [ ] = {10,20,30,40,50};

int sum = 0;
for(int x : nums){
sum = sum + x;
}
System.out.println("Sum : " + sum);
System.out.println("Average: " + (sum/nums.length));

}
}



