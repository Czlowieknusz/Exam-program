public class Pudełko {
    private String nazwa, rozmiar;

    public Pudełko(String nazwa, String rozmiar) {
        this.rozmiar = rozmiar;
        this.nazwa = nazwa;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nazwa == null) ? 0 : nazwa.hashCode());
        result = prime * result + ((rozmiar == null) ? 0 : rozmiar.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pudełko other = (Pudełko) obj;
        if (rozmiar != other.rozmiar)
            return false;
        if (nazwa == null) {
            if (other.nazwa != null)
                return false;
        } else if (!nazwa.equals(other.nazwa))
            return false;
        return true;
    }
}
