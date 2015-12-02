package SooSo.Application;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import rcaller.RCaller;

public class Panel_Prediction_R {

	private static JTextArea textArea;

	public static void create(JPanel panel) throws Exception {
		try {
			// Creating an instance of class RCaller
			RCaller caller = new RCaller();

			// Important. Where is the Rscript?
			// This is Rscript.exe in windows
			caller.setRscriptExecutable("C:\\Program Files\\R\\R-3.2.1\\bin\\Rscript.exe");

			// Generating x and y vectors
			double[] x = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			double[] y = new double[] { 2, 4, 6, 8, 10, 12, 14, 16, 18, 30 };

			// Generating R code
			// addDoubleArray() method converts Java arrays to R vectors
			caller.addDoubleArray("x", x);
			caller.addDoubleArray("y", y);

			// ols<-lm(y~x) is totally R Code
			// but we send the x and the y vectors from Java
			caller.addRCode("ols<-lm(y~x)");

			// We are running the R code but
			// we want code to send some result to us (java)
			// We want to handle the ols object generated in R side
			//
			caller.runAndReturnResult("ols");

			// We are printing the content of ols
			System.out.println("Available results from lm() object:");
			System.out.println(caller.getParser().getNames());

			// Parsing some objects of lm()
			// Residuals, coefficients and fitted.values are some elements of
			// lm()
			// object returned by the R. We parsing those elements to use in
			// Java
			double[] residuals = caller.getParser().getAsDoubleArray("residuals");
			double[] coefficients = caller.getParser().getAsDoubleArray("coefficients");
			double[] fitteds = caller.getParser().getAsDoubleArray("fitted_values");

			// Printing results
			System.out.println("Coefficients:");
			for (int i = 0; i < coefficients.length; i++) {
				System.out.println("Beta " + i + " = " + coefficients[i]);
			}

			System.out.println("Residuals:");
			for (int i = 0; i < residuals.length; i++) {
				System.out.println(i + " = " + residuals[i]);
			}

		} catch (

		Exception e)

		{
			System.out.println(e.toString());
		}

	}

}
