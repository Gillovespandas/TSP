package travellingSalesman;

import java.util.*;

import Countdown.FileIO;

public class TownArray {

	public static void main(String[] args) {

		// Read in town info

		FileIO reader = new FileIO();

		Scanner scan = new Scanner(System.in);

		String[] input = reader.load("/Users/deangilmore/Dropbox/Eclipse/Cs211/src/travellingSalesman/1000airports.txt");

		// create an array of town objects

		Town[] townArray = new Town[input.length];


		for (int arrayPos = 0; arrayPos < input.length; arrayPos++) {

			input[arrayPos] = input[arrayPos].replace("\r\n", "").trim();

			String[] towns = input[arrayPos].split(",", 4);

			int townNum = Integer.parseInt(towns[0]);

			String townName = towns[1];

			double latitude = Double.valueOf(towns[2]);

			double longitude = Double.valueOf(towns[3]);

			townArray[arrayPos] = new Town(townNum, townName, latitude,
					longitude);
			
			
		}
		
		int temp = 100000;
		int count = 999, current = 2;
		String T1 = "";
		double tempDist = 0;
		//System.out.print(current + 1);
		townArray[current].visted = 1;
		
		while(count > 0)
		{
			tempDist = 100000;
			totalDistance =0;

			for(int i = 0; i < townArray.length; i++)
			{
				if(townArray[current].distance(townArray[i])< tempDist && townArray[current].distance(townArray[i]) != 0 && townArray[i].visted == 0)
				{
					temp = i;
					tempDist = townArray[current].distance(townArray[i]);
					System.out.println(temp);
				}
				
			}
			current = temp;
			townArray[current].visted = 1;
			//System.out.print("."+ (current + 1));
			count--;
		}
		
		
		//System.out.println((temp+1) + " : " + T1);
		
		//System.out.println(totalDistance);
	}




	
		
	
	}

