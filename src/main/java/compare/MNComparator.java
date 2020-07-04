package compare;

import data.Students;

public class MNComparator implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return o1.getMatriculationNumber()-o2.getMatriculationNumber();
    }

}