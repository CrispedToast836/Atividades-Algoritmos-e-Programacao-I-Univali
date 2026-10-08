/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
#include <cstdlib> 
#include <ctime>   
using namespace std;

int gerarNumeroComputador(){
    return rand() % 11;
}

int calcularResultado(int numeroJogador, int numeroComputador){
    return numeroJogador + numeroComputador;
}

bool verificarVencedor(int resultado, int escolhaJogador){
    if (resultado % 2 == 0){
        if(escolhaJogador == 1){
            return true;
        }else{
            return false;
        }
    }else{
        if(escolhaJogador == 2){
            return true;
        }else{
            return false;
        }
    }
}

void exibirPlacar(int pontosJogador, int pontosComputador){
    cout << "  PLACAR  " << endl;
    cout << "Jogador " << pontosJogador << " X " << pontosComputador << " Computador" << endl << endl;
}

int main(){
    
    int pontosJogador, pontosComputador, continuar, escolha, numJogador, numComputador, soma;
    bool jogadorVenceu;
    
    pontosJogador = 0;
    pontosComputador = 0;
    continuar = 1;
    
    srand(time(0));
    
    system("clear");
    cout << "Bem-vindo ao Jogo Par ou Impar!!!" << endl << endl;
    
    while(continuar == 1){
        
        cout << "Escolha seu lado: [1] para PAR ou [2] para IMPAR." << endl;
        
        cin >> escolha;
        
        if(escolha != 1 && escolha != 2){
            while(escolha != 1 && escolha != 2){
                system("clear");
                cout << "Dígito inválido, por favor escolha denovo entre 1 (PAR) e 2 (IMPAR)" << endl;
                cin >> escolha;
            }
        }
        
        system("clear");
        
        if(escolha == 1){
            cout << "Você escolheu PAR! O Computador ficou com IMPAR! Vamos começar!!!" << endl << endl;
        }else{
            cout << "Você escolheu IMPAR! O Computador ficou com PAR! Vamos começar!!!" << endl << endl;
        }
        
        cout << "Escolha um número de 0 a 10 para jogar:" << endl;
        cin >> numJogador;
        
        if(numJogador > 10 || numJogador < 0){
            while(numJogador > 10 || numJogador < 0){
                system("clear");
                cout << "Número inválido, por favor digitar um número de 0 a 10" << endl;
                cin >> numJogador;
            }
        }
        
        system("clear");
        
        cout << "Processando jogada..." << endl << endl;
        
        numComputador = gerarNumeroComputador();
        soma = calcularResultado(numJogador, numComputador);
        jogadorVenceu = verificarVencedor(soma, escolha);
        
        cout << "Você jogou: " << numJogador << "!" << endl;
        cout << "O Computador jogou: " << numComputador << "!" << endl;
        cout << "A soma deu " << soma << "!" << endl << endl;
        
        if(jogadorVenceu == true){
            cout << "Parabéns você venceu!!!" << endl << endl;
            pontosJogador++;
        }else{
            cout << "Ixi, o computador venceu essa rodada!!!" << endl << endl;
            pontosComputador++;
        }
        
        exibirPlacar(pontosJogador, pontosComputador);
        
        cout << "Deseja continuar jogando? [1] Sim ou [2] Não" << endl;
        cin >> continuar;
        
        if(continuar != 1 && continuar != 2){
            while(continuar != 1 && continuar != 2){
                system("clear");
                cout << "Dígito inválido, por favor escolha denovo entre 1 (Sim) e 2 (Não)" << endl;
                cin >> continuar;
            }
        }
        
        if(continuar == 1){
            system("clear");
            cout << "Trocando turnos..." << endl << endl;
        }
        
    }
    
    system("clear");
    cout << "Fim de jogo!!!" << endl << endl;
    exibirPlacar(pontosJogador, pontosComputador);
    
    return 0;
    
}