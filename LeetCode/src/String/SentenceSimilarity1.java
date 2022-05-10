/**
 https://gist.github.com/aquawj/1d8b62533b7a5d6633013cd0d5a47a43#file-734-sentence-similarity-i-ii-java
 
 * 734. I:
Given two sentences words1, words2 (each represented as an array of strings), and a list of similar word pairs pairs, determine if two sentences are similar.

For example, "great acting skills" and "fine drama talent" are similar, if the similar word pairs are pairs = [["great", "fine"], ["acting","drama"], ["skills","talent"]].

Note that the similarity relation is not transitive. For example, if "great" and "fine" are similar, and "fine" and "good" are similar, "great" and "good" are not necessarily similar.

However, similarity is symmetric. For example, "great" and "fine" being similar is the same as "fine" and "great" being similar.

Also, a word is always similar with itself. For example, the sentences words1 = ["great"], words2 = ["great"], pairs = [] are similar, even though there are no specified similar word pairs.

Finally, sentences can only be similar if they have the same number of words. So a sentence like words1 = ["great"] can never be similar to words2 = ["doubleplus","good"].

 */

package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class SentenceSimilarity1 {
    public boolean areSentencesSimilar(String[] a, String[] b, String[][] pairs) {
        if (a.length != b.length) return false;
        Map<String, Set<String>> map = new HashMap<>();
        for (String[] p : pairs) {
            if (!map.containsKey(p[0])) map.put(p[0], new HashSet<>());
            map.get(p[0]).add(p[1]);
        }

        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i]) && !map.getOrDefault(a[i], new HashSet<>()).contains(b[i]) && !map.getOrDefault(b[i], new HashSet<>()).contains(a[i]))
                return false;
        return true;
    }
}