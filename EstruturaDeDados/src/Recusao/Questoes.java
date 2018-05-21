package Recusao;

import provaDavid.ConsumoInternet;
import provaDavid.Data;
import provaDavid.Horario;
import provaDavid.RoteadorJavaAPI;

public class Questoes {
	
	public Horario q2(Data data) {
		return maiorDownloadRec(data, RoteadorJavaAPI.getConsumo(data), null, Double.MIN_NORMAL, 0, 0);
	}
	
	private Horario maiorDownloadRec (Data data, ConsumoInternet[][] mci, Horario horario, double maiorDonwload, int i, int j) {
		
		if(i < mci.length) {
			if(j < mci[i].length) {
				if(maiorDonwload <= mci[i][j].getDownload()) {
					maiorDonwload = mci[i][j].getDownload();
					horario.setHora(i);
					horario.setMinuto(j);
				}
				return maiorDownloadRec(data, mci, horario, maiorDonwload, i, j + 1);
			}
			return maiorDownloadRec(data, mci, horario, maiorDonwload, i + 1, 0);
		}
		return horario;
	}
	
	public ConsumoInternet q3 (Data data, int hora) {
		
		return mediaCiNaHora(data, hora, 0.0, 0.0, 0, RoteadorJavaAPI.getConsumo(data)[hora], null);
	}

	private ConsumoInternet mediaCiNaHora(Data data, int hora, double mediaDownload, double mediaUpload, int j, ConsumoInternet[] aci, ConsumoInternet media) {
		
		if(j < aci.length) {
			mediaDownload = mediaDownload + aci[j].getDownload();
			mediaUpload = mediaUpload + aci[j].getUpload();
			
			return mediaCiNaHora(data, hora, mediaDownload, mediaUpload, j + 1, aci, media);
		}
		
		media.setDownload(mediaDownload / aci.length);
		media.setUpload(mediaUpload / aci.length);
		
		return media;
	}
	
	public ConsumoInternet q4 (Data dataInicio, Data dataFim) {
		return mediaIntervalo(RoteadorJavaAPI.getConsumo(dataInicio), RoteadorJavaAPI.getConsumo(dataFim), RoteadorJavaAPI.getConsumo(dataInicio).length, 0, new ConsumoInternet());
	}
	
	private ConsumoInternet mediaIntervalo (ConsumoInternet[][] mciInicio, ConsumoInternet[][] mciFim, int i, int j, ConsumoInternet resultado) {
		if(i < mciFim.length) {
			if(j < mciFim[i].length) {
				resultado.setDownload(resultado.getDownload() + mciFim[i][j].getDownload());
				resultado.setUpload(resultado.getUpload() + mciFim[i][j].getUpload());
				return mediaIntervalo(mciInicio, mciFim, i, j + 1, resultado);
			}
			return mediaIntervalo(mciInicio, mciFim, i + 1, 0, resultado);
		}
		resultado.setDownload(resultado.getDownload() / (mciFim.length - mciInicio.length) * mciFim[mciInicio.length].length);
		resultado.setUpload(resultado.getUpload() / (mciFim.length - mciInicio.length) * mciFim[mciInicio.length].length);
		return resultado;
	}

}
