# Seis problemas no uso de construtores

1. Não expressam a intenção do desenvolvedor;

2. Impossível ter dois construtores com a mesma assinatura;

3. new X() -> volta sempre um objeto novo da classe Z refletindo em custo computacional;

4. Não consigo reaproveitar objetos mesmo quando é oportuno e necessário, por exemplo, em situações de concorrência;

5. Não consigo voltar um objeto da subclasse;

6. Pode implicar em acoplamento concreto;


  