import java.util.*;

public class EstadisticaTexto {
	
	private String texto;
	
	public EstadisticaTexto(String texto) {
		this.texto = texto; getDifferenceWords();
	}
	
	// Ordenar array y luego por su frecuencia y luego invertirlo
	
	public ArrayList<String> getWordsMoreFrequent(int numberWords) {
		ArrayList<String> arr = getWordsInFrequencyOrder();
		Collections.reverse(arr);
		return cutArray(arr, numberWords);
	}
	
	public ArrayList<String> getWordsLessFrequent(int numberWords) {
		ArrayList<String> arr = getWordsInFrequencyOrder();
		return cutArray(arr, numberWords);
	}
	
	private ArrayList<String> cutArray(ArrayList<String> arr, int numberWords) {
		for (int i = numberWords; i < arr.size() || arr.size() <= numberWords ; i++) {
			arr.remove(i);
		}
		return arr;
	}
	
	private int getDifferenceWords() {
		String textAux = this.remaplaceGrammarChar();
		ArrayList<String> words =  asArrayList(textAux.split(" "));
		int sameWords = 0;
		for (String word : words) {
			if (words.contains(word)) {
				sameWords++;
			}
		}
		return words.size() - sameWords;
	}
	
	public double getFrequencyWord(String w1) {
		String textAux = this.remaplaceGrammarChar();
		String[] words = textAux.split(" ");
		int sameWord = 0;
		for (String w2 : words) {
			if(w1.equals(w2)) {
				sameWord++;
			}
		}
		return ((double)sameWord/words.length);
	}
	
	public ArrayList<String> getWordsinAsendingOrder() {
		String textAux = this.remaplaceGrammarChar();
		ArrayList<String> auxArr = new ArrayList<String>();
		auxArr = asArrayList(textAux.split(" "));
		Collections.sort(auxArr);
		return auxArr;
	}
	
	public ArrayList<String> getWordsInFrequencyOrder() {
		String textAux = this.remaplaceGrammarChar();
		ArrayList<String> words =  asArrayList(textAux.split(" "));
		Map<Double, String> auxArr = new LinkedHashMap<Double, String>();
		for (String word : words) {
			if(!auxArr.containsValue(word)) {
				auxArr.put((this.getFrequencyWord(word)), word);
			}
		}
		

	    List<Map.Entry<Double, String>> entries = new ArrayList<Map.Entry<Double, String>>();
	    Collections.sort(entries, new Comparator<Map.Entry<Double, String>>() {
	        public int compare(Map.Entry<Double, String> a,
	                Map.Entry<Double, String> b) {
	            return a.getValue().compareTo(b.getValue());
	        }
	    });
		return new ArrayList<String>(auxArr.values());
	}
		
	private String remaplaceGrammarChar() {
		String aux = texto;
		aux = aux.replace(",", "");
		aux = aux.replace(".", "");
		aux = aux.replace(":", "");
		aux = aux.replace("(", "");
		aux = aux.replace(")", "");
		return aux;
	}
	
	private ArrayList<String> asArrayList(String[] arr) {
		ArrayList<String> aux = new ArrayList<String>();
		for (String string : arr) {
			aux.add(string);
		}
		return aux;
	}
	/*
	private void deleteSameWord(ArrayList<String> words, String w1) {
		for (int i = 0; i < words.size(); i++) {
			String w2 = words.get(i);
			if (w1.equals(w2)) {
				words.remove(i);
			}
		}
	}
	
	
	private boolean wordsMoreFrequent(String w1, String w2) {
		return this.frequencyWord(w1)>this.frequencyWord(w2) && w1.equals(w2);
	}
	
	private boolean wordsLessFrequent(String w1, String w2) {
		return this.frequencyWord(w1)<this.frequencyWord(w2) && w1.equals(w2);
	}

	 * public Stack<String> getWordsMoreFrequent(int amountWord) {
		Stack<String> aux = new  Stack<String>();
		String[] words = texto.split(" ");
		for (String word : words) {
			for (int i = amountWord-1; i > 0; i--) {
				String wordMoreFrequent = aux.get(i);
				if (this.frequencyWord(word)>this.frequencyWord(wordMoreFrequent) && word.equals(wordMoreFrequent)) {
					aux.removeElementAt(0);
					aux.push(word);
					break;
				}
			}
		}
		return aux;
	}
	
	public Stack<String> getWordsLessFrequent(int amountWord) {
		Stack<String> aux = new  Stack<String>();
		String[] words = texto.split(" ");
		for (String word : words) {
			for (int i = amountWord-1; i > 0; i--) {
				String wordMoreFrequent = aux.get(i);
				if (this.frequencyWord(word)<this.frequencyWord(wordMoreFrequent) && word.equals(wordMoreFrequent)) {
					aux.removeElementAt(0);
					aux.push(word);
					break;
				}
			}
			
		}
		return aux;
	}*/

}
