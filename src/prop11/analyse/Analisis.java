package prop11.analyse;

import java.util.List;
import java.util.ArrayList;
public class Analisis {
	
	private List<String> paths;
	private Administrador admin;
	
	public Analisis(List<String> pathsInput, Administrador admin){
		paths = new ArrayList<String>();
		for(String s: pathsInput){
			paths.add(s); //Strings are imutable so no problem			
		}
		
		this.admin = admin;
	}
	
	public List<Respuesta_Encuesta> importResp(){
		
	}
	
	public Resultados k_means(List<Respuesta_Encuesta> listToAnalyse, int k, int sizeVector, double thresholdDist){
		
		//variable listToAnalyse is an array containing the results we want to analyse
		//variable k is the number of centroids we want
		//variable sizeVector is the number of question of the questionnary
		//variable thresholdDist is the distance that will determine when k-mean will end
		
		//CREATION OF SEEDS
		//generar los seeds random?
		Respuesta_Encuesta seed = new Respuesta_Encuesta();
		for(int i = 0; i < k; i++){
			for(int j = 0; j < sizeVector; j++){
				//generate random answer "random" to the question
				Respuesta_Pregunta rp = new Respuesta_Pregunta(random);
				seed.add(rp);
			}			
		}
		
		//ASSIG EACH RESPUESTA_ENCUESTA TO CLUSTER
		for(Respuesta_encuesta ra: listToAnalyse){
			double distance_min = Double.POSITIVE_INFINITY;
			int index_centroid = 0;
			
			for(int i = 0; i < k; i++){
				double distance = 0;
				for(int index = 0; index < sizeVector; index++){
					//Compute distance between ra.get(index) and seeds.get(index)
					//Increment distance
				}
				if(distance < distance_min){
					distance_min = distance;
					index_centroid = k;
				}
			}
			
			//Store the result of assignation
			
			
		}
		
		
		
	}
	
	
	
}
