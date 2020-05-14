    class Trie {
        HashMap<Character,Trie> children;
        boolean isEnd;
        /** Initialize your data structure here. */
        public Trie() {
            isEnd = false;
            children = new HashMap<>();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            Trie curr = this;
            for (int i=0;i<word.length();i++){
                char cc = word.charAt(i);
                if (!curr.children.containsKey(cc)){
                    curr.children.put(cc,new Trie());
                }
                curr = curr.children.get(cc);
            }
            curr.isEnd = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            Trie curr = this;
            for (int i=0;i<word.length();i++){
                char cc = word.charAt(i);
                if (!curr.children.containsKey(cc)){
                    return false;
                }
                curr = curr.children.get(cc);
            }
            return curr.isEnd;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            Trie curr = this;
            for (int i=0;i<prefix.length();i++){
                char cc = prefix.charAt(i);
                if (!curr.children.containsKey(cc)){
                    return false;
                }
                curr = curr.children.get(cc);
            }
            return true;
        }
    }
