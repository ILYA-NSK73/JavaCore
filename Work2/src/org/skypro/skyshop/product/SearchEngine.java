package org.skypro.skyshop.product;

public class SearchEngine {
    private final Searchable[] items;
    private int size = 0;

    public SearchEngine(int capacity) {
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

    public Searchable findBest(String search) throws BestResultNotFound {
        if (search == null || search.isEmpty()) {
            throw new BestResultNotFound(search);
        }

        Searchable best = null;
        int bestCount = 0;

        for (int i = 0; i < size; i++) {
            Searchable item = items[i];
            if (item == null) {
                continue;
            }

            String term = item.getSearchTerm();
            if (term == null || term.isEmpty()) {
                continue;
            }

            int count = countOccurrences(term, search);
            if (count > bestCount) {
                bestCount = count;
                best = item;
            }
        }

        if (best == null || bestCount == 0) {
            throw new BestResultNotFound(search);
        }

        return best;
    }

    private int countOccurrences(String text, String substring) {
        int count = 0;
        int index = 0;

        int pos = text.indexOf(substring, index);
        while (pos != -1) {
            count++;
            index = pos + substring.length();
            pos = text.indexOf(substring, index);
        }
        return count;
    }
}

