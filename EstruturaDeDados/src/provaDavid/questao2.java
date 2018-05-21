package provaDavid;

public class questao2 {
	
	public static Horario questao02Recursao(Data d) {
		ConsumoInternet ci[][] = new RoteadorJavaAPI().getConsumo(d);
		Horario h = new Horario();
		double maior = ci[0][0].getDownload();
		return questao02Recursao(d,maior, h, 0, 0, ci);
	} 
	
	public static Horario questao02Recursao(Data d, double maior, Horario hNovo, int l,
			int c, ConsumoInternet[][] ci) {
		
		if(l < ci.length) {
			if(c < ci[l].length) {
				
				if(maior < ci[l][c].getDownload()) {
					maior = ci[l][c].getDownload();
					hNovo.setHora(l);
					hNovo.setMinuto(c);
				}
				return questao02Recursao(d, maior, hNovo, l, ++c, ci);
			}
			
			return questao02Recursao(d, maior, hNovo, ++l, c = 0, ci);
		}
		return hNovo;
		
	}
	
	public static Horario questao02(Data d) {
		ConsumoInternet ci[][] = new RoteadorJavaAPI().getConsumo(d);
		double maior = ci[0][0].getDownload();
		Horario h = new Horario();
		for(int l = 0; l < ci.length; l++) {
			for(int c = 0; c <ci[l].length; c++) {
				if(maior < ci[l][c].getDownload()) {
					maior = ci[l][c].getDownload();
					h.setHora(l);
					h.setMinuto(c);
				}
			}
		}
		return h;
		
	}
	
	public static ConsumoInternet questao03Recursao(Data d, int horaInserida) {
		ConsumoInternet ci[][] = new RoteadorJavaAPI().getConsumo(d);
		ConsumoInternet ciNovo = new ConsumoInternet();
		return questao03Recursao(d, horaInserida, ci, ciNovo, 0, 0, 0, 0);
	}
	
	public static ConsumoInternet questao03Recursao(Data d, int horaInserida, ConsumoInternet [][] ci, 
			ConsumoInternet ciNovo,int cont, int c, double donw, double up) {

			if(c < ci[horaInserida].length) {
				if(ci[horaInserida] != null) {
					donw += ci[horaInserida][c].getDownload();
					up += ci[horaInserida][c].getUpload();
					cont++;
				}
				return questao03Recursao(d, horaInserida, ci, ciNovo, cont, ++c, donw, up);
			}
		
		ciNovo.setDownload(donw / cont);
		ciNovo.setUpload(up / cont);
		
		return ciNovo;
	}
	
	public static ConsumoInternet questao03 (Data d, int horaInserida) {
		ConsumoInternet ci[][] = new RoteadorJavaAPI().getConsumo(d);
		ConsumoInternet cinovo = new ConsumoInternet();
		int cont = 0;
		double dow = 0, upl = 0;
		if(d.getAno() < 0 || d.getAno() > 2018 || d.getMes() < 1 || d.getMes() > 12
				|| d.getDia() < 0 || d.getDia() > 31) {
			return null;
		}
		if(d.getMes() == 2 && d.getAno() % 400 == 0 && d.getDia() != 28) {
			return null;
		} else {
				for(int c = 0; c < ci[horaInserida].length; c++) {
					// estou na hora atual e verifico até quanto ele terá minutos não nulos
					if(ci[horaInserida] !=  null) {
						dow +=  ci[horaInserida][c].getDownload();
						upl += ci[horaInserida][c].getUpload();
						cont++;
					} 
				}
				cinovo.setDownload(dow / cont);
				cinovo.setUpload(upl / cont);
				return cinovo;
			}
		}
	
	
	public static ConsumoInternet questao04 (Data dataInicio, Data dataFinal) {
		RoteadorJavaAPI rj = new RoteadorJavaAPI();
		ConsumoInternet ci1[][] = rj.getConsumo(dataInicio);
		ConsumoInternet ci2[][] = rj.getConsumo(dataFinal);
		ConsumoInternet cinovo = new ConsumoInternet();
		double somaDown = 0, somaUp = 0;
		
			for(int l = 0; l < ci1.length; l++) {
				for(int c = 0; c < ci1[l].length; c++) {
					somaDown += ci1[l][c].getDownload();
					somaUp += ci1[l][c].getUpload();
				}
			}
			
			for(int l = 0; l < ci2.length; l++) {
				for(int c = 0; c < ci2[l].length; c++) {
					somaDown += ci2[l][c].getDownload();
					somaUp += ci2[l][c].getUpload();
				}
			}
			cinovo.setDownload(somaDown / 60);
			cinovo.setUpload(somaUp / 60);
			return cinovo;
	}
			
}

