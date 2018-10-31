/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/9/">Lab 9 Description</a>
 */
public class Employee {

    /** Name of the employee. */
    private String name;

    /** Name of the manager. */
    private String manager;

    /**
     * Constructor for initialization.
     * @param setName name of the new employee
     * @param setManager manager of the new employee
     */
    public Employee(final String setName, final String setManager) {
        this.name = setName;
        this.manager = setManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param setName new name
     */
    public void setName(final String setName) {
        this.name = setName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param setManager new manager
     */
    public void setManager(final String setManager) {
        this.manager = setManager;
    }
}
