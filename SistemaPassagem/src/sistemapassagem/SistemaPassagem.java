package sistemapassagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luis Marcello Moraes Silva Gustavo Molina de Souza Pedrenrique
 * Guimarães
 */
public class SistemaPassagem {

    public static void main(String[] args) {
        //Variáveis básicas
        int dia, mes, ano, hora, minutos, origem, destino, kilometragem, i, vagas, opcao = 0,
                diaChegada, mesChegada, anoChegada, horaIda, minIda, horaChegada, minChegada,
                indiceMotorista = 0, indiceOnibus = 0;
        String cidadeOrigem, cidadeDestino, cidadeParada1, cidadeParada2, cidadeParada3;
        double preco;
        String nome, rg, profissao, cnh, modelo, marca, endereco;
        int op_passa, op_oni, op_moto, op_rota;

        //Classe para ler os arquivos
        Scanner input = new Scanner(System.in);

        //Declarando os objetos necessarios
        CadastraPassageiro passageiro;
        CadastraOnibus onibus;
        CadastraMotorista motorista;
        Rota rota = null;
        Data admissao;
        Data dataIda;
        Data dataChegada;
        Hora horarioIda;
        Hora horarioChegada;

        //Listas de Array
        List<CadastraOnibus> listaOnibus = new ArrayList<CadastraOnibus>();
        List<CadastraPassageiro> listaPassageiro = new ArrayList<CadastraPassageiro>();
        List<Rota> listaRota = new ArrayList<Rota>();
        List<CadastraMotorista> listaMotorista = new ArrayList<CadastraMotorista>();

        /*TODO: FAZER SISTEMA INTEIRO PARA CADASTRAR CADA UM DOS DADOS
         * 	CONSERTAR O ERRO DO SCANNER PULAR UM DADO - FEITO
         * Teste Passageiro*/
        while (opcao != -1) {
            //Menu principal organizado
            System.out.println("Digite o que deseja fazer:");
            System.out.println("1 - Cadastrar passageiro");
            System.out.println("2 - Excluir último passageiro");
            System.out.println("3 - Alterar dados de passageiro");
            System.out.println("4 - Mostrar dados de passageiro");
            System.out.println("5 - Cadastrar motorista");
            System.out.println("6 - Excluir último motorista");
            System.out.println("7 - Alterar dados de motorista");
            System.out.println("8 - Mostrar dados de motorista");
            System.out.println("9 - Cadastrar Rota");
            System.out.println("10 - Excluir Rota");
            System.out.println("11 - Alterar dados de Rota");
            System.out.println("12 - Mostrar dados de Rota");
            System.out.println("13 - Cadastrar Ônibus");
            System.out.println("14 - Excluir Ônibus");
            System.out.println("15 - Alterar dados de Ônibus");
            System.out.println("16 - Mostrar dados de Ônibus");
            System.out.println("-1 - Sair do programa");

            opcao = Integer.parseInt(input.nextLine());

            //Cadastro de passageiros
            if (opcao == 1) {
                System.out.println("--Cadastrar Passageiro--");

                System.out.println("Digite o nome do passageiro: ");
                nome = input.nextLine();
                System.out.println("Digite o rg: ");
                rg = input.nextLine();
                System.out.print("Digite o dia de nascimento: ");
                dia = Integer.parseInt(input.nextLine());
                System.out.print("Digite o mês de nascimento: ");
                mes = Integer.parseInt(input.nextLine());
                System.out.print("Digite o ano de nascimento: ");
                ano = Integer.parseInt(input.nextLine()); //Evita um problema do Scanner pular o próximo input.nextLine()
                System.out.println("Digite a profissão: ");
                profissao = input.nextLine();
                System.out.println("Digite o endereço: ");
                endereco = input.nextLine();
                System.out.println("Rotas disponíveis: ");
                if (listaRota.isEmpty() == true) {
                    System.out.println("Não há rotas disponíveis! ");
                    System.out.println("Passageiro não cadastrado.");
                } else {
                    passageiro = new CadastraPassageiro(nome, rg, profissao, endereco, dia, mes, ano, rota);
                    listaPassageiro.add(passageiro);
                }

            }
            //exclui passageiro
            if (opcao == 2) {
                if (listaPassageiro.isEmpty() == true) {
                    System.out.println("Nao há Passageiros!");
                } else {
                    System.out.println("último passageiro excluido!");
                    listaPassageiro.remove(listaPassageiro.size() - 1);
                }
            }
            //alterar dados
            if (opcao == 3) {
                System.out.println("Digite o passageiro que deseja alterar (número):");
                op_passa = Integer.parseInt(input.nextLine());
                if (listaPassageiro.get(op_passa) == null && listaPassageiro.isEmpty() == true) {
                    System.out.println("Nao há Passageiros ou Não foi encontrado!");
                } else {

                    System.out.println("Digite o nome do passageiro: ");
                    listaPassageiro.get(op_passa).setNome(input.nextLine());
                    System.out.println("Digite o rg: ");
                    listaPassageiro.get(op_passa).setRg(input.nextLine());
                    System.out.println("Digite a profissão: ");
                    listaPassageiro.get(op_passa).setProfissao(input.nextLine());
                    System.out.println("Digite o endereço: ");
                    listaPassageiro.get(op_passa).setEndereco(input.nextLine());
                    System.out.print("Digite o dia de nascimento: ");
                    dia = Integer.parseInt(input.nextLine());
                    System.out.print("Digite o mês de nascimento: ");
                    mes = Integer.parseInt(input.nextLine());
                    System.out.print("Digite o ano de nascimento: ");
                    ano = Integer.parseInt(input.nextLine());
                    listaPassageiro.get(op_passa).setDatanasc(dia, mes, ano);
                }
            }
            //exibir
            if (opcao == 4) {
                System.out.println("Digite o passageiro que deseja exibir (número):");
                op_passa = Integer.parseInt(input.nextLine());
                if (listaPassageiro.get(op_passa) == null && listaPassageiro.isEmpty() == true) {
                    System.out.println("Nao há Passageiros ou Não foi encontrado!");
                } else {
                    listaPassageiro.get(op_passa).getPassageiro();
                }
            }

            //Cadastro de Motorista
            if (opcao == 5) {
                System.out.println("--Cadastrar Motorista--");
                System.out.println("Digite o nome do motorista: ");
                nome = input.nextLine();
                System.out.println("Digite o numero da CNH: ");
                cnh = input.nextLine();
                System.out.print("Digite o dia de admissão: ");
                dia = Integer.parseInt(input.nextLine());
                System.out.print("Digite o mês de admissão: ");
                mes = Integer.parseInt(input.nextLine());
                System.out.print("Digite o ano de admissão: ");
                ano = Integer.parseInt(input.nextLine());
                admissao = new Data(dia, mes, ano);

                motorista = new CadastraMotorista(cnh, nome, dia, mes, ano, admissao);
                listaMotorista.add(motorista);
            }

            if (opcao == 6) { //Exclui o último motorista da lista

                if (listaMotorista.isEmpty() == true) {
                    System.out.println("Não há Motoristas");
                } else {
                    System.out.println("--Excluído da lista o último motorista--");
                    listaMotorista.remove(listaMotorista.size() - 1); //Usa o método "remove" para excluir da lista o elemento com último índice
                }
            }
            //Altera os dados do motorista por meio do índice digitado pelo usuário
            if (opcao == 7) { //Altera os dados do motorista por meio do índice digitado pelo usuário
                System.out.println("--Editar dados Motorista--");
                System.out.println("Digite o índice do motorista a sofrer alteração: ");
                op_moto = Integer.parseInt(input.nextLine()); //Índice do elemento que será alterado
                if (listaMotorista.isEmpty() == true && listaMotorista.get(op_moto) == null) {
                    System.out.println("Nao há Motoristas!");
                } else {
                    System.out.println("Digite o nome do motorista: ");
                    listaMotorista.get(op_moto).setNome(input.nextLine()); //Usa o método set para alterar o atributo "nome" do motorista de índice i
                    System.out.println("Digite o numero da CNH: ");
                    listaMotorista.get(op_moto).setCnh(input.nextLine()); //Usa o método set para alterar o atributo "cnh" do motorista de índice i
                    System.out.print("Digite o dia de admissão: ");
                    dia = Integer.parseInt(input.nextLine());
                    System.out.print("Digite o mês de admissão: ");
                    mes = Integer.parseInt(input.nextLine());
                    System.out.print("Digite o ano de admissão: ");
                    ano = Integer.parseInt(input.nextLine());
                    listaMotorista.get(op_moto).setDatanasc(dia, mes, ano); //Usa o método set para alterar os atributos "dia", "mês" e "ano" de admissão do motorista de índice i                    
                }
            }
            // Mostra na tela os dados do motorista pelo índice
            if (opcao == 8) {
                System.out.println("Digite o índice do motorista que deseja exibir (número): ");
                op_moto = Integer.parseInt(input.nextLine()); //Índice do motorista
                if (listaMotorista.isEmpty() == true && listaMotorista.get(op_moto) == null) {
                    System.out.println("Nao há Motoristas!");
                } else {
                    listaMotorista.get(op_moto).getMotorista(); //Método que printa os dados do motorista
                }
            }
            //Cadastro de Rota
            if (opcao == 9) {
                System.out.println("--Cadastrar Rota--");

                System.out.println("Digite a cidade de origem: ");
                cidadeOrigem = input.nextLine();
                System.out.println("Digite a cidade de destino: ");
                cidadeDestino = input.nextLine();
                System.out.println("Digite a primeira cidade de parada: ");
                cidadeParada1 = input.nextLine();
                System.out.println("Digite a segunda cidade de parada: ");
                cidadeParada2 = input.nextLine();
                System.out.println("Digite a terceira cidade de parada: ");
                cidadeParada3 = input.nextLine();
                System.out.println("Digite a hora de partida: ");
                horaIda = Integer.parseInt(input.nextLine());
                System.out.println("Digite os minutos de partida: ");
                minIda = Integer.parseInt(input.nextLine());
                System.out.println("Digite a hora de chegada: ");
                horaChegada = Integer.parseInt(input.nextLine());
                System.out.println("Digite os minutos de chegada: ");
                minChegada = Integer.parseInt(input.nextLine());
                System.out.print("Digite o dia da partida: ");
                dia = Integer.parseInt(input.nextLine());
                System.out.print("Digite o mês da partida: ");
                mes = Integer.parseInt(input.nextLine());
                System.out.print("Digite o ano da partida: ");
                ano = Integer.parseInt(input.nextLine());
                System.out.println("Digite o dia da chegada: ");
                diaChegada = Integer.parseInt(input.nextLine());
                System.out.println("Digite o mês da chegada: ");
                mesChegada = Integer.parseInt(input.nextLine());
                System.out.println("Digite o ano da chegada: ");
                anoChegada = Integer.parseInt(input.nextLine());
                System.out.println("Digite o preço da passagem: ");
                preco = Double.parseDouble(input.nextLine());

                //Criando os Objetos para passar por parâmetro
                dataIda = new Data(dia, mes, ano);
                dataChegada = new Data(diaChegada, mesChegada, anoChegada);
                horarioIda = new Hora(horaIda, minIda);
                horarioChegada = new Hora(horaChegada, minChegada);

                if (listaMotorista.isEmpty() == true) {
                    System.out.println("Não há motoristas cadastrados!");
                    System.out.println("Rota não criada. Cadastre um motorista primeiro.");
                } else {
                    if (listaOnibus.isEmpty() == true) {
                        System.out.println("Não há ônibus cadastrados!");
                        System.out.println("Rota não criada. Cadastre um ônibus primeiro");
                    } else {
                        System.out.println("Digite o índice do motorista cadastrado (na lista): ");
                        indiceMotorista = Integer.parseInt(input.nextLine());
                        if (listaMotorista.get(indiceMotorista) == null) {
                            System.out.println("Não há motorista cadastrado nesse índice.");
                        } else {
                            motorista = listaMotorista.get(indiceMotorista);
                            System.out.println("Digite o índice do ônibus cadastrado (na lista): ");
                            indiceOnibus = Integer.parseInt(input.nextLine());
                            if (listaOnibus.get(indiceOnibus) == null) {
                                System.out.println("Não há ônibus cadastrado nesse índice!");
                            } else {
                                onibus = listaOnibus.get(indiceOnibus);
                                //Construindo o Objeto
                                rota = new Rota(cidadeOrigem, cidadeDestino, cidadeParada1, cidadeParada2,
                                        cidadeParada3, horarioIda, horarioChegada, dataIda, dataChegada,
                                        onibus, preco, motorista
                                );
                                listaRota.add(rota);

                            }
                        }

                    }

                }
            }
            //excluir rota
            if (opcao == 10) {
                if (listaRota.isEmpty() == true) {
                    System.out.println("Nao há Rotas!");
                } else {
                    listaRota.remove(listaRota.size() - 1);
                    System.out.println("Rota removida com sucesso!");

                }

            }
            //alterar a rota
            if (opcao == 11) {
                System.out.println("Digite o índice da rota que deseja exibir (número): ");
                op_rota = Integer.parseInt(input.nextLine()); //Índice da rota
                if (listaRota.isEmpty() == true && listaRota.get(op_rota) == null) {
                    System.out.println("Nao há Rotas ou não foi encontrado!");
                } else {
                    System.out.println("Digite a cidade de origem: ");
                    listaRota.get(op_rota).setCidadeOrigem(input.nextLine());
                    System.out.println("Digite a cidade de destino: ");
                    listaRota.get(op_rota).setCidadeDestino(input.nextLine());
                    System.out.println("Digite a primeira cidade de parada: ");
                    listaRota.get(op_rota).setCidadeParada1(input.nextLine());
                    System.out.println("Digite a segunda cidade de parada: ");
                    listaRota.get(op_rota).setCidadeParada2(input.nextLine());
                    System.out.println("Digite a terceira cidade de parada: ");
                    listaRota.get(op_rota).setCidadeParada3(input.nextLine());
                    System.out.print("Digite o dia da partida: ");
                    dia = Integer.parseInt(input.nextLine());
                    System.out.print("Digite o mês da partida: ");
                    mes = Integer.parseInt(input.nextLine());
                    System.out.print("Digite o ano da partida: ");
                    ano = Integer.parseInt(input.nextLine());
                    System.out.println("Digite o dia da chegada: ");
                    diaChegada = Integer.parseInt(input.nextLine());
                    listaRota.get(op_rota).setData(dia, mes, ano, diaChegada);
                    System.out.println("Digite o preço da passagem: ");
                    listaRota.get(op_rota).setPreco(Double.parseDouble(input.nextLine()));
                    preco = Double.parseDouble(input.nextLine());

                }

            }
            //exibir rota
            if (opcao == 12) {

                System.out.println("Digite o índice da rota que deseja exibir (número): ");
                op_rota = Integer.parseInt(input.nextLine()); //Índice da rota
                if (listaRota.isEmpty() == true && listaRota.get(op_rota) == null) {
                    System.out.println("Nao há Rotas ou não foi encontrado!");
                } else {
                    listaRota.get(op_rota).getRota();

                }

            }

            // Cadastra um novo ônibus
            if (opcao == 13) {
                System.out.println("--Cadastrar Ônibus--");
                System.out.println("Digite modelo do ônibus: ");
                modelo = input.nextLine();
                System.out.println("Digite a marca do ônibus: ");
                marca = input.nextLine();
                System.out.print("Digite a kilometragem do ônibus: ");
                kilometragem = Integer.parseInt(input.nextLine());
                System.out.print("Digite o ano: ");
                ano = Integer.parseInt(input.nextLine());
                System.out.print("Digite o número de vagas: ");
                vagas = Integer.parseInt(input.nextLine());
                onibus = new CadastraOnibus(modelo, marca, kilometragem, ano);
                listaOnibus.add(onibus); // Adiciona o novo ônibus ao final da lista
                listaOnibus.get(listaOnibus.size() - 1).criarAssentos(vagas); // Chama o método criarAssentos do último elemento adicionado à lista
                //listaOnibus.get(listaOnibus.size()).reservarAssentos(); // Chama o método reservarAssentos do último elemento ônibus da lista
            }
            // Exclui o ônibus de índice i
            if (opcao == 14) {
                if (listaOnibus.isEmpty() == true) {
                    System.out.println(" Não há ônibus!");
                }
                System.out.println("Excluido o último Onibus!");
                listaOnibus.remove(listaOnibus.size() - 1);
            }
            // Altera dos dados do ônibus de índice i
            if (opcao == 15) {
                System.out.println("Digite o índice do ônibus que deseja alterar (número): ");
                op_oni = Integer.parseInt(input.nextLine()); //Índice da rota
                if (listaOnibus.isEmpty() == true && listaOnibus.get(op_oni) == null) {
                    System.out.println("ônibus não encontrado!");
                } else {
                    System.out.println("Digite o modelo: ");
                    listaOnibus.get(op_oni).setModelo(input.nextLine());
                    System.out.println("Digite a marca: ");
                    listaOnibus.get(op_oni).setMarca(input.nextLine());
                    System.out.println("Digite a Kilometragem: ");
                    listaOnibus.get(op_oni).setKilometragem(input.nextInt());
                    System.out.println("Digite o ano: ");
                    listaOnibus.get(op_oni).setAno(input.nextInt());
                }
            }
            //mostrar
            if (opcao == 16) {
                System.out.println("Digite o índice do ônibus que deseja exibir (número): ");
                op_oni = Integer.parseInt(input.nextLine()); //Índice
                if (listaOnibus.isEmpty() == true && listaOnibus.get(op_oni) == null) {
                    System.out.println("Nao há Ônibus ou não foi encontrado!");
                } else {
                    listaOnibus.get(op_oni).getBus();
                }
            }
        }
        input.close();
    }

}
