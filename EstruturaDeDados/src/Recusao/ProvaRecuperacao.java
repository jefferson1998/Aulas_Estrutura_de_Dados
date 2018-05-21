package Recusao;

import provaDavid.ConsumoInternet;
import provaDavid.Data;
import provaDavid.Horario;
import provaDavid.RoteadorJavaAPI;

public class ProvaRecuperacao {
	public static Horario questao02Recursao(Data d) {
		ConsumoInternet ci[][] = new RoteadorJavaAPI().getConsumo(d);
		Horario h = new Horario();
		double maior = ci[0][0].getDownload();
		return questao02Recursao(d, maior, h, 0, 0, ci);
	}

	public static Horario questao02Recursao(Data d, double maior, Horario hNovo, int l, int c, ConsumoInternet[][] ci) {

		if (l < ci.length) {
			if (c < ci[l].length) {
				if (maior < ci[l][c].getDownload()) {
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

	public static ConsumoInternet questao03Recursao(Data d, int horaInserida) {
		ConsumoInternet ci[][] = new RoteadorJavaAPI().getConsumo(d);
		ConsumoInternet ciNovo = new ConsumoInternet();
		return questao03Recursao(d, horaInserida, ci, ciNovo, 0, 0, 0, 0);
	}

	public static ConsumoInternet questao03Recursao(Data d, int horaInserida, ConsumoInternet[][] ci,
			ConsumoInternet ciNovo, int cont, int c, double donw, double up) {

		if (c < ci[horaInserida].length) {
			if (ci[horaInserida] != null) {
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
}
