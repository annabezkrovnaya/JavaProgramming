package ua.org.oa.annabezkrovnaya.practice3;

import java.util.ArrayList;
import java.util.List;

public class GenericStorageImpl<V extends Entity<Integer>> implements GenericStorage<Integer, V> {

    private int id = 0;
    List<Node<Integer, V>> nodes = new ArrayList<>();


    @Override
    public Integer create(V value) {
        nodes.add(new Node<Integer, V>(++id, value));
        value.setId(id);

        return id;
    }

    @Override
    public V read(Integer id) {
        V value  = null;
        for(Node<Integer, V> node : nodes){
            if(node.getKey().equals(id)){
                value = node.getValue();

            }
        }
        return value;
    }

    @Override
    public Node<Integer, V> update(Integer key, V value) {
        int index = 0;
        for (int i = 0; i < nodes.size(); i++){
            if(nodes.get(i).getKey().equals(key)){
                index = i;
                nodes.get(i).setValue(value);

            }
        }
        return nodes.get(index);
    }

    @Override
    public boolean delete(Integer key) {
        return nodes.removeIf(integerVNode -> integerVNode.getKey().equals(key));
    }
}
