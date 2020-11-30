package MyCode.Week_02.Array;

public class Array<T> {
    private T[] data;
    private int size;   // 数组中存储的元素个数，并非数组大小

    /**
     * 默认构造函数，大小为10
     */
    public Array(){
        this(10);
    }

    /**
     * 构造一个大小为capacity的数组
     * @param capacity
     */
    public Array(int capacity){
        data = (T[])new Object[capacity];
        size = 0;
    }

    /**
     * 向数组下标为index处添加元素element
     * @param element
     * @param index
     */
    public void add(int index,T element){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("参数错误，请检查数组下标的合法性");
        if (size == data.length)
            resize(2 * data.length);
        for(int i = size; i > index;i--){
            data[i] = data[i - 1];
        }
        data[index] = element;
        size++;
    }

    /**
     * 在数组开始位置插入
     * @param element
     */
    public void addFirst(T element){
        add(0,element);
    }
    /**
     * 在数组尾部插入
     * @param element
     */
    public void addLast(T element){
        add(size,element);
    }
    /**
     * 将data[index]设置为element
     * @param index
     * @param element
     */
    public void set(int index,T element){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("参数错误，请检查数组下标的合法性");
        data[index] = element;

    }

    /**
     * element 是否在数组中
     * @param element
     * @return
     */
    public  boolean contains(T element){
        for(T e : data){
            if(element.equals(e))
                return true;
        }
        return false;
    }

    /**
     * 查找元素element的下标，如果不存在则返回-1
     * @param element
     * @return
     */
    public int find(T element){
        for(int i = 0; i < size ;i++){
            if(data[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    /**
     * 通过下标返回数组中对应的元素
     * @param index
     * @return
     */
    public T get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("参数错误，请输入合法的数组下标");
        return data[index];
    }
    public T getLast(){
        return get(size - 1);
    }
    public T getFirst(){
        return get(0);
    }
    /**
     * 返回数组的容量
     * @return
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 返回数组中的元素个数
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 判断数组是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 删除data[index]
     * @param index
     * @return
     */
    public T remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("参数错误，请输入合法的数组下标");
        T temp = data[index];
        for(int i = index ; i < size - 1;i++){
            data[i] = data[i+1];
        }
        size--;
        if(size == data.length/4)  //防止复杂度震荡
            resize(data.length/2);
        return temp;
    }
    /**
     * 删除数组中为element的元素，并返回其下标,若不存在则返回-1
     * @param element
     * @return
     */
    public int removeElement(T element){
        for(int i = 0 ; i < size ;i ++){
            if(data[i].equals(element)){
                remove(i);
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除数组开始位置元素
     * @return
     */
    public T removeFirst(){
        return remove(0);
    }

    /**
     * 删除数组中最后一个元素
     * @return
     */
    public T removeLast(){
        return remove(size -1);
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("capacity: %d,size : %d ,",getCapacity(),getSize()));
        builder.append("data : [");
        for(int i = 0; i < size-1; i ++){
            builder.append(data[i]);
            builder.append(",");
        }
        builder.append(data[size -1]);
        builder.append("]");
        return builder.toString();
    }
    private void resize(int newcapacity){
        T[] arr = (T[])new Object[newcapacity];
        for(int i = 0 ; i < size; i++){
            arr[i] = this.data[i];
        }
        this.data = arr;
    }

}
