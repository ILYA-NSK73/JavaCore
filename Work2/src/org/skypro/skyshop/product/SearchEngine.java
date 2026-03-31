package org.skypro.skyshop.product;

public class SearchEngine {
    private final Searchable[] items;
    private int size = 0;

    public SearchEngine (int capacity) {
        this.items = new Searchable[capacity];
    }

    public void add(Searchable item) {
        if (size < items.length) {
            items[size++] = item;
        }
    }

    public Searchable[] search(String query) {
        Searchable[] result = new Searchable[5];
        int found = 0;

        for (int i = 0; i < size && found < 5; i++) {
            Searchable item = items[i];
            if (item == null) {
                continue;
            }

            String term = item.getSearchTerm();
            if (term != null && term.contains(query)) {
                result[found] = item;
                found++;

                if (found == 5) {
                    break;
                }
            }
        }
        return result;
    }
}
