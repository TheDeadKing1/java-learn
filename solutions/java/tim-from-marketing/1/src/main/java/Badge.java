class Badge {
    public String print(Integer id, String name, String department) {
        if (department == null){
            department = "OWNER"; 
        }
        if (id == null) {
            return name + " - " + department.toUpperCase();
        }
        String badge = "[" + id + "] - " + name;
        badge = badge + " - " + department.toUpperCase();
        return badge;
    }
}
