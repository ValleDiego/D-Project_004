package model;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
	
	private String nome;
	
	private String tipo1;
	private String tipo2;
	
	private String ability;
	
	private int hp;
	private int atk;
	private int def;
	private int spatk;
	private int spdef;
	private int spe;
	
	private List<Mossa> movepool;
	
	private String immagine;
	private String shiny;
	
	public Pokemon(String nome, String tipo1, String tipo2, String ability, int hp, int atk, int def, int spatk, int spdef, int spe,
			List<Mossa> movepool, String immagine, String shiny) {
		
		this.nome = nome;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.ability = ability;
		this.hp=hp;
		this.atk = atk;
		this.def = def;
		this.spatk = spatk;
		this.spdef = spdef;
		this.spe = spe;
		this.movepool = new ArrayList(movepool);
		this.immagine = immagine;
		this.shiny = shiny;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo1() {
		return tipo1;
	}

	public String getTipo2() {
		return tipo2;
	}
	
	public String getAbility() {
		return ability;
	}
	
	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public int getDef() {
		return def;
	}

	public int getSpatk() {
		return spatk;
	}

	public int getSpdef() {
		return spdef;
	}

	public int getSpe() {
		return spe;
	}

	public List<Mossa> getMovepool() {
		return movepool;
	}
	
	public String getImmagine() {
		return immagine;
	}

	public String getShiny() {
		return shiny;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public void descriviti() {
		System.out.println(nome+": "+tipo1+"-"+tipo2);
		for(int i=0; i <4; i++) {
			System.out.println("- "+ movepool.get(i).toString());
		}
		System.out.println(" ");
	}
	
	

}