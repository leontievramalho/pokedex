package br.edu.catolica.pokedex.Main;

import br.edu.catolica.pokedex.Controller.ControllerEquipe;
import br.edu.catolica.pokedex.Controller.ControllerPokedex;
import br.edu.catolica.pokedex.Model.*;

public class Main {
    public static void main(String[] args){

        InfoBasicas infoPikachu = new InfoBasicas("Pikachu", "eletrico",
                "Ele mantém sua cauda levantada para monitorar seus arredores." +
                        " Se você puxar o rabo dele, ele tentará mordê-lo.");

        Habilidade statick = new Habilidade("Static",
                "Paraliza ao contato");
        Habilidade lightningRod = new Habilidade("Lightning Rod",
                "Atrai golpes elétricos e aumenta o Sp. Atk.");

        Golpe thunderShock = new Golpe("Thunder Shock", "eletrico", 40, "especial", 100,
                "Thunder Shock causa dano e tem 10% de chance de paralisar o alvo.");

        CaracteristicasFisicas caracteristicasPikachu = new CaracteristicasFisicas(40, 6000,
                "Pi-ka-chuuu");

        Pokemon pikachu = new Pokemon(infoPikachu, caracteristicasPikachu,
                new Stats(35,55,30,50,40,90), statick, thunderShock);

        pikachu.addHabilidade(lightningRod);



        InfoBasicas infoPoliwag = new InfoBasicas("Poliwag", "agua",
                "A direção da espiral na barriga difere por área." +
                        " É mais hábil em nadar do que caminhar.");

        Habilidade waterAbsorb = new Habilidade("Water Absorb",
                "Restaura HP se receber um golpe de água.");
        Habilidade damp = new Habilidade("Damp",
                "Previne autodestruição.");

        Golpe waterGun = new Golpe("Water Gun", "agua", 40, "especial", 100,
                "Water Gun inflige danos e não tem efeito secundário.");

        CaracteristicasFisicas caracteristicasPoliwag = new CaracteristicasFisicas(60, 12400,
                "Poliwaag");

        Pokemon poliwag = new Pokemon(infoPoliwag, caracteristicasPoliwag,
                new Stats(40,50,40,40,40,90), waterAbsorb, waterGun);

        poliwag.addHabilidade(damp);



        InfoBasicas infoRaichu = new InfoBasicas("Raichu", "eletrico",
                "Quando a eletricidade se acumula dentro de seu corpo, ele se torna mal-humorado. " +
                        "Ele também brilha no escuro.");

        CaracteristicasFisicas caracteristicasRaichu = new CaracteristicasFisicas(80, 30000,
                "Rai-chuuu");

        Pokemon raichu = new Pokemon(infoRaichu, caracteristicasRaichu,
                new Stats(60,90,55,90,80,100), statick, thunderShock);

        raichu.addHabilidade(lightningRod);

        InfoBasicas infoCharmander = new InfoBasicas("Charmander", "fogo",
                "Sua saúde pode ser medida pelo fogo na ponta de sua cauda." +
                        "Quando queima brilhantemente indica que ele está com a saúde boa.");

        Habilidade blaze = new Habilidade("Blaze",
                "Aumenta o poder dos movimentos do tipo Fire em uma pitada.");
        Habilidade solarPower = new Habilidade("Solar Power",
                "Ao sol, Sp.Atk é aumentado, mas HP diminui");

        Golpe ember = new Golpe("Ember", "eletrico", 40, "especial", 100,
                "Ember causa dano e tem 10% de chance de queimar o alvo.");

        CaracteristicasFisicas caracteristicasCharmander = new CaracteristicasFisicas(60, 8500,
                "Charmaandeer");

        Pokemon charmander = new Pokemon(infoCharmander, caracteristicasCharmander,
                new Stats(39,52,43,60,50,65), blaze, ember);

        charmander.addHabilidade(solarPower);


        LinhaEvolutiva pikachuRaichu = new LinhaEvolutiva(pikachu, raichu, "pedra trovao");

        ControllerPokedex pokedex= new ControllerPokedex();

        try {
            pokedex.inserirPokemon(pikachu);
            pokedex.inserirPokemon(raichu);
            pokedex.inserirPokemon(poliwag);
            pokedex.inserirPokemon(charmander);
            pokedex.pokedex.listarTodos();
        } catch (Exception e){
            System.err.println(e);
        }

        try {
            ControllerEquipe equipe = new ControllerEquipe();
            equipe.inserirPokemon(pikachu);
            equipe.inserirPokemon(poliwag);
            equipe.inserirPokemon(charmander);
            equipe.evolucoes.inserir(pikachuRaichu);
            equipe.equipe.listarTodos();
            equipe.evoluir(pikachu, "pedra trovao");
            equipe.equipe.listarTodos();
        } catch (Exception e){
            System.err.println(e);
        }
    }
}
