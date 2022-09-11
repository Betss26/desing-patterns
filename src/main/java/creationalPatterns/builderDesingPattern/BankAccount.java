package creationalPatterns.builderDesingPattern;

/**
 * Tenga en cuenta que todos los modificadores de acceso en los campos se declaran privados ya que no queremos que los objetos externos accedan a ellos directamente.
 * El constructor también es privado, por lo que solo el constructor asignado a esta clase puede acceder a él. Todas las propiedades establecidas en el constructor se extraen del objeto constructor que proporcionamos como argumento.
 * Hemos definido BankAccountBuilder en una clase interna estática:
 */
public class BankAccount {

    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    private BankAccount(BankAccountBuilder bankAccountBuilder) {
    }

    //constructors/getters

    public static class BankAccountBuilder {

        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder withNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build(){
            return new BankAccount(this);
        }
    }
}
