package syracuse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class algosyra {

	private Long valeur, altitude, dureeDeVol;
	private ArrayList<Long> etapes = new ArrayList<Long>();
	private ArrayList<Long> listAlti = new ArrayList<Long>();
	private ArrayList<Long> listDuree = new ArrayList<Long>();

	public algosyra(long n)
	{
		this.valeur = n;
		this.altitude = n;
		this.dureeDeVol = (long) 0;
		this.etapes = new ArrayList<Long>();
		this.listAlti = new ArrayList<Long>();
		this.listDuree = new ArrayList<Long>();
	}

	public void generationSuite()
	{
		while(valeur !=1 )
		{
			etapes.add(valeur);
			if(valeur%2 == 1)
			{
				valeur = valeur*3 + 1;
			}
			else valeur = valeur / 2 ;
			if ( valeur > altitude ) altitude = valeur;
			dureeDeVol = dureeDeVol + 1 ;
		}
	}

	public Long getAltitude() {
		return altitude;
	}

	public Long getDureeDeVol() {
		return dureeDeVol;
	}

	public void afficherEtapes()
	{
		System.out.println("{");
		for (int i = 0 ; i < etapes.size() ; i ++)
		{
			System.out.println((i+1)+"	"+etapes.get(i));
		}
		System.out.println("}");
	}

	public String toString()
	{
		return("Altitude : " + this.altitude + " ; Duree de vol : " + this.dureeDeVol);
	}	

	public static void main (String[] args)
	{
		/**long[] res = new long[8000000];
		HashMap<Long, Integer> stat = new HashMap<Long, Integer>();
		for(int i = 1 ; i < res.length ; i ++)
		{
			algosyra a = new algosyra(i);
			a.generationSuite();
			res[i] = a.getDureeDeVol();
		}
		for(int k = 1 ; k < res.length ; k++)
		{
			int cpt = 0;
			for (int l = 1 ; l < res.length ; l++)
			{
				if(res[k] == res[l]) cpt ++;
			}
			stat.put(res[k], cpt);
		}
		for (Long index : stat.keySet())
		{
			System.out.println(index +"	" + stat.get(index));
		}
		algosyra a = new algosyra((long) Math.pow(2.,63-1));*/
		algosyra a = new algosyra(26);
		a.generationSuite();
		a.afficherEtapes();
		System.out.println(a);
	}
}