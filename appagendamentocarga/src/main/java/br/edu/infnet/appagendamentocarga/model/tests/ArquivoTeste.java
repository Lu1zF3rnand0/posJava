package br.edu.infnet.appagendamentocarga.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appagendamentocarga.exceptions.ChassiInvalidoException;
import br.edu.infnet.appagendamentocarga.exceptions.MercadoriaInvalidaException;
import br.edu.infnet.appagendamentocarga.exceptions.PortoInvalidoException;
import br.edu.infnet.appagendamentocarga.exceptions.TamanhoInvalidoException;
import br.edu.infnet.appagendamentocarga.model.domain.Agendamento;
import br.edu.infnet.appagendamentocarga.model.domain.Carga;
import br.edu.infnet.appagendamentocarga.model.domain.CargaSolta;
import br.edu.infnet.appagendamentocarga.model.domain.Cliente;
import br.edu.infnet.appagendamentocarga.model.domain.Conteiner;
import br.edu.infnet.appagendamentocarga.model.domain.Veiculo;

public class ArquivoTeste {

	public static void main(String[] args) {

		try {
			 String dir = "C:/Users/luizf/git/posJava/";
			String arq = "arquivo.txt";

			try {
				FileReader fileR = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileR);

				FileWriter fileW = new FileWriter(dir + "out_" + arq);
				BufferedWriter escrita = new BufferedWriter(fileW);

				Agendamento agendamento = new Agendamento();
				List<Carga> cargas = new ArrayList<Carga>();

				String linha = leitura.readLine();

				String[] campos = null;

				while (linha != null) {
					campos = linha.split(";");

					switch (campos[0]) {
					case "C":
						try {
							Conteiner conteiner = new Conteiner("MSC TESTE", "21/123456-7", "BRRIO");
							conteiner.setNumero(campos[1]);
							conteiner.setStatus(campos[2]);
							conteiner.setTamanho(Integer.valueOf(campos[3]));
							cargas.add(conteiner);
							//escrita.write(conteiner.getNavio() + ";" + conteiner.getNumero() + ";"+ conteiner.retornaNavio() + "\r\n");
						} catch (PortoInvalidoException | TamanhoInvalidoException e) {
							System.out.println(e.getMessage());

						}
						break;
						
					case "CS":						
						try {
							CargaSolta cargaSolta = new CargaSolta("MSC TESTE", "21/765432-1", "BRRIO");
							cargaSolta.setMercadoria(campos[1]);
							cargaSolta.setImo(Boolean.valueOf(campos[2]));
							cargaSolta.setOog(Boolean.valueOf(campos[3]));
							cargas.add(cargaSolta);
							//escrita.write(cargaSolta.getNavio() + ";" + cargaSolta.getMercadoria() + ";" + cargaSolta.retornaNavio() + "\r\n");
						} catch (PortoInvalidoException | MercadoriaInvalidaException e) {
							System.out.println(e.getMessage());
						}
						
						break;

					case "V":
						try {
							Veiculo veiculo = new Veiculo("MSC TESTE", "21/123456-3", "BRRIO");
							veiculo.setChassi(campos[1]);
							veiculo.setModelo(campos[2]);
							veiculo.setMontadora(campos[3]);
							cargas.add(veiculo);
							//escrita.write(veiculo.getNavio() + ";" + veiculo.getChassi() + ";" + veiculo.retornaNavio()+ "\r\n");
						} catch (PortoInvalidoException | ChassiInvalidoException e) {
							System.out.println(e.getMessage() + "\r\n");
						}

						break;

					case "P":
						Cliente cliente = new Cliente();
						cliente.setId(1);
						cliente.setNome(campos[3]);
						cliente.setCnpj(campos[4]);
						cliente.setTelefone(campos[5]);
						cliente.setEmail(campos[6]);

						agendamento.setId(1);
						agendamento.setTipo(campos[1]);
						agendamento.setTransportador(campos[2]);
						agendamento.setCliente(cliente);
						break;

					default:
						System.out.println("Tipo de carga inválido!");
						break;
					}

					linha = leitura.readLine();

				}

				agendamento.setCargas(cargas);		


				for (Carga carga : agendamento.getCargas()) {
					escrita.write(agendamento.getTransportador());
					escrita.write(";");
					escrita.write(agendamento.getCliente().getNome());
					escrita.write(";");
					escrita.write(carga.retornaNavio());
					escrita.write("\r\n"); 
				}

				fileR.close();
				leitura.close();
				escrita.close();
				fileW.close();

			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		} finally {
			System.out.println("Processamento realizado!");
		}

	}

}
