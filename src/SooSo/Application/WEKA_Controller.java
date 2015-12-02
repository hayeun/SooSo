package SooSo.Application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;

public class WEKA_Controller {
	
	public static Instances data;
	public static J48 J48Tree;

	public WEKA_Controller() throws Exception {
		String[] args = { "APPLIED_DATA.csv", "APPLIED_DATA.arff" };
		//CSV2Arff(args);
		dataReader(args[1]);
		setJ48();
	}

	public void CSV2Arff(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("\nUsage: CSV2Arff <input.csv> <output.arff>\n");
			System.exit(1);
		}

		CSVLoader loader = new CSVLoader();
		loader.setSource(new File(args[0]));
		Instances data = loader.getDataSet();

		ArffSaver saver = new ArffSaver();
		saver.setInstances(data);
		saver.setFile(new File(args[1]));
		saver.setDestination(new File(args[1]));
		saver.writeBatch();
		System.out.println("End of CSV2Arff");
	}

	public void dataReader(String s) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(s));

		data = new Instances(reader);
		reader.close();

		data.setClassIndex(data.numAttributes() - 1);
		System.out.println("End of Data Reading");
	}

	public void setJ48() throws Exception {
		J48Tree = new J48();
		J48Tree.buildClassifier(data);
		System.out.println("End of J48");
	}
	
	public J48 getJ48() throws Exception{
		//return J48Tree.graph();
		return J48Tree;
	}
	
	//pblic BayesNet setBayesNet
}
