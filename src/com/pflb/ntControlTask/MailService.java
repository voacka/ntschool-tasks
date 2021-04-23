package com.pflb.ntControlTask;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Helper<T>> {
    private Map<String, List<T>> result = new HashMap<>() {
        public List<T> get(Object key) {
            return super.getOrDefault(key, new LinkedList<T>());
        }
    };

    @Override
    public void accept(Helper<T> helper) {
        if (result.containsKey(helper.getTo())) {
            List<T> value = result.get(helper.getTo());
            value.add(helper.getContent());
        } else {
            result.put(helper.getTo(), new ArrayList<T>(Arrays.asList(helper.getContent())));
        }
    }

    @Override
    public Consumer<Helper<T>> andThen(Consumer<? super Helper<T>> after) {
        return null;
    }

    public Map<String, List<T>> getMailBox() {
        return result;
    }
}
