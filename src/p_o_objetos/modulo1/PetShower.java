package p_o_objetos.modulo1;

public class PetShower {

    Boolean petNoBanho = false;
    int agua = 0;
    int shampoo = 0;

    public void colocarPet() {
        if (this.petNoBanho) {
            System.out.println("Já tem pet no banho!");
        } else {
            this.petNoBanho = true;
        }
    }

    public void retirarPet(Pet pet) {
        if (!this.petNoBanho) {
            System.out.println("Não tem pet no banho!");
        } else {
            if (pet.limpo) {
                System.out.println("Pet retirado com sucesso!");
            } else {
                System.out.println("Pet sujo, limpe a maquina!");
                this.limparMaquina();
                pet.limpo = false;
            }
            this.petNoBanho = false;
        }
    }

    public void verificarAgua() {
        System.out.println(this.agua);
    }

    public void verificarShampoo() {
        System.out.println(this.shampoo);
    }

    public void verificarPetNoBanho() {
        if (this.petNoBanho) {
            System.out.println("Tem pet no banho");
        } else {
            System.out.println("Não tem pet no banho");
        }
    }

    public void abastecerAgua() {
        this.agua += 2;
    }

    public void abastecerShampoo() {
        this.shampoo += 2;
    }

    public void darBanho(Pet pet) {
        if (this.petNoBanho && this.agua >= 10 && this.shampoo >= 2) {
            this.agua -= 10;
            this.shampoo -= 2;
            pet.limpo = true;
            System.out.println("Banho realizado com sucesso!");
        } else {
            System.out.println("Não é possível dar banho no pet!");
        }
    }

    public void limparMaquina() {
        if (this.agua >= 3 && this.shampoo >= 1) {
            this.agua -= 3;
            this.shampoo -= 1;
            System.out.println("Maquina limpa com sucesso!");
        } else {
            System.out.println("Não é possível limpar a máquina!");
        }
    }
}
