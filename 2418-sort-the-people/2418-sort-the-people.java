class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        List<NameHeightPair> nameHeightList = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            nameHeightList.add(new NameHeightPair(names[i], heights[i]));
        }
        Collections.sort(nameHeightList, Collections.reverseOrder());

        String[] sortedNames = new String[nameHeightList.size()];
        for (int i = 0; i < nameHeightList.size(); i++) {
            sortedNames[i] = nameHeightList.get(i).getName();
        }
        return sortedNames;
    }
}


class NameHeightPair implements Comparable<NameHeightPair> {
    private String name;
    private int height;

    public NameHeightPair(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(NameHeightPair other) {
        return Integer.compare(this.height, other.height);
    }
}
