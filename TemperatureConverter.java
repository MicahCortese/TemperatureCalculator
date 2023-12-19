import java.util.Scanner;

public class TemperatureConverter {
	// Selected = true ... Unselected = false
	static boolean fSelect = false; 
	static boolean cSelect = false; 
	static boolean kSelect = false; 
	
	static boolean convertToF = false;
	static boolean convertToC = false;
	static boolean convertToK = false;
	
	// degree counter
	static double f = 0.0;
	static double c = 0.0;
	static double k = 0.0;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Infinitely asks the user for temperature and degree selection.
		int x;
		do {
				// Starting Messages
				System.out.println("\nSelect the type of temperature that you want to start with?\n");
				System.out.println("Choices:");
				System.out.println("1. Fahrenheit (\u00B0F)");
				System.out.println("2. Celsius (\u00B0C)");
				System.out.println("3. Kelvin (K)");	
			
				tempSelect(sc.nextInt()); // Choose starting temperature
			
				System.out.println("\nHow many degrees? ");
			
				degreeSelect(sc.nextDouble()); // choose starting degree
				
				System.out.println("\nWhat do you want to convert it to?");
				System.out.println("1. Fahrenheit (\u00B0F)");
				System.out.println("2. Celsius (\u00B0C)");
				System.out.println("3. Kelvin (K)");
				
				convertTo(sc.nextInt()); // choose temperature to convert to.
				convert();
				reset();
				
				System.out.println("\nContinue another conversion?");
				System.out.println("1. Continue");
				System.out.println("2. Exit");
				
				x = sc.nextInt();
				if (x == 2) {
					System.exit(0);
				}
				
			} while (x == 1);
		
	} // End of main method.
	
	// Starting Temperature Selection
	static void tempSelect(int select) {
		if (select == 1) 
		{
			fSelect = true;
			//System.out.println("Fahrenheit Selected");
		}
		else if (select == 2) 
		{
			cSelect = true;
			//System.out.println("Celsius Selected");
		}
		else if (select == 3) 
		{
			kSelect = true;
			//System.out.println("Rankine Selected");
		}
		else 
		{
			System.out.println("Invalid input");
		}	
	} 
	
	// Conversion Selection
	static void convertTo(int select) {
		if (select == 1) 
		{
			convertToF = true;
			//System.out.println("Fahrenheit Selected");
		}
		else if (select == 2) 
		{
			convertToC = true;
			//System.out.println("Celsius Selected");
		}
		else if (select == 3) 
		{
			convertToK = true;
			//System.out.println("Kelvin Selected");
		}
		else 
		{
			System.out.println("Invalid input");
		}	
	}
	
	// Degree Selection
	static void degreeSelect(double select) {
		
		if (select >= 0 || select <= 0) 
		{
			if (fSelect == true) 
			{
				f = select;
			}
			else if (cSelect == true) 
			{
				c = select;
			}
			else if (kSelect == true) 
			{
				k = select;
			}
			else 
			{
				System.out.println("Invalid input");
			}
		}
	}
	
	// Conversion Functions
	static void fahrenheitToCelsius()
	{
		double result = (f-32) * 5/9;
		System.out.println("\nCelsius: " + result);	
	}
	
	static void celsiusToFahrenheit()
	{
		double result = (c * 9/5) + 32;
		System.out.println("\nFahrenheit: " + result);
	}
	
	static void fahrenheitToKelvin()
	{
		double result = (f - 32) * 5/9 + 273.15;
		System.out.println("\nKelvin: " + result);
	}
	
	static void kelvinToFahrenheit()
	{
		double result = (k - 273.15) * 9/5 + 32;
		System.out.println("\nFahrenheit: " + result);
	}
	
	static void celsiusToKelvin()
	{
		double result = c + 273.15;
		System.out.println("\nKelvin: " + result);
	}
	
	static void kelvinToCelsius()
	{
		double result = k - 273.15;
		System.out.println("\nCelsius: " + result);
	}

	// Final Conversions
	static void convert()
	{
		if (fSelect == true && convertToC == true) // Fahrenheit to Celsius
		{
			fahrenheitToCelsius();
		}
		else if (cSelect == true && convertToF == true) // Celsius to Fahrenheit
		{
			celsiusToFahrenheit();
		}
		else if (fSelect == true && convertToK == true) // Fahrenheit to Kelvin
		{
			fahrenheitToKelvin();
		}
		else if (kSelect == true && convertToF == true) // Kelvin to Fahrenheit
		{
			kelvinToFahrenheit();
		}
		else if (cSelect == true && convertToK == true) // Celsius to Kelvin
		{
			celsiusToKelvin();
		}
		else if (kSelect == true && convertToC == true) // Kelvin to Celsius
		{
			kelvinToCelsius();
		}
	}
	
	// Reset Conversion Selections
	static void reset()
	{
		fSelect = false; 
		cSelect = false; 
		kSelect = false; 
		convertToF = false;
		convertToC = false;
		convertToK = false;
	}
} // End of program
