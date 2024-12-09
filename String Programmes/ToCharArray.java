// String Program

// toCharArray() method

class ToCharArray{

public static void main(String args [ ]){

String s = "Welcome";

char arr[ ] = s.toCharArray();
System.out.println("USING FOR LOOP");
for(int i = 0; i<arr.length; i++){
System.out.print(arr[i]);
}
System.out.println("\n##########################");
System.out.println("USING FOR EACH LOOP");

for ( char x : arr){
System.out.print(x);
}

}
}



