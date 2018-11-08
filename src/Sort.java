public class Sort {
    public static Member[] bubbleSort(Member[] teamMember, boolean ascending)
    {
        int size = teamMember.length;
        int last, current;
        Member temp;
        for(last = size-1; last > 0; last = last - 1)
        { for(current = 0; current < last; current = current + 1)
        {
            if(ascending) {
                if (teamMember[current].getBirthday() > teamMember[current + 1].getBirthday())
                {
                    temp = teamMember[current];
                    teamMember[current] = teamMember[current+1];
                    teamMember[current+1] = temp;
                }
            } else {
                if (teamMember[current].getBirthday() < teamMember[current + 1].getBirthday())
                {
                    temp = teamMember[current];
                    teamMember[current] = teamMember[current+1];
                    teamMember[current+1] = temp;
                }
            }
        }
        }

        return teamMember;
    }
}

