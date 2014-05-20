package com.lara;

public class PascalTriangle
{
		     
		    public static void main(String args[]) {
		         
		        int n = 5;           // Number of rows
		         
		        int[] row = new int[0];
		         
		        for(int i=0 ; i < n ; i++){
		             
		            row = nextRow(row);
		             
		            for(int j=0;j < n-i;j++){
		                 
		                //Padding For Triangle
		                System.out.print(" ");
		                 
		            }
		            //Output the values
		            for(int j=0 ; j < row.length ; j++){
		                 
		                System.out.print(row[j]+" ");
		         
		            }
		            //Start New Line
		            System.out.println();
		        }
		    }
		    /*Find Values Of Next Row*/
		    public static int[] nextRow(int row[]){
		         
		        int nextRow[] = new int [row.length+1];
		         
		        nextRow[0] = 1;               //First element always be 1
		        nextRow[nextRow.length-1] =1; //Last element should be 1
		         
		        //generating rest values from the previous row
		        for(int i=1 ; i < nextRow.length-1 ; i++){
		             
		            nextRow[i] = row[i-1] + row[i];
		        }
		        return nextRow;
		    }
		     
		}


