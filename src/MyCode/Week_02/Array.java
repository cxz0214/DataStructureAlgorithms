package MyCode.Week_02;

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
    void add(int index,T element){
        if (size == data.length)
            throw new IllegalArgumentException("数组已满无法添加！");
        if(index < 0 || index > size)
            throw new IllegalArgumentException("参数错误，请检查数组下标的合法性");
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
    void addFirst(T element){
        add(0,element);
    }
    /**
     * 在数组尾部插入
     * @param element
     */
    void addLast(T element){
        add(size,element);
    }
    /**
     * 将data[index]设置为element
     * @param index
     * @param element
     */
    void set(int index,T element){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("参数错误，请检查数组下标的合法性");
        data[index] = element;

    }

    /**
     * element 是否在数组中
     * @param element
     * @return
     */
    boolean contains(T element){
        for(T e: data){
            if(element.ComparaTo(e) == 0)
                return true;
        }
        return false;
    }

    /**
     * 查找元素element的下标，如果不存在则返回-1
     * @param element
     * @return
     */
    int find(T element){
        for(int i = 0; i < size ;i++){
            if(data[i].ComparaTo(element) == 0){
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
    T get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("参数错误，请输入合法的数组下标");
        return data[index];
    }

    /**
     * 返回数组的容量
     * @return
     */
    int getCapacity(){
        return data.length;
    }

    /**
     * 返回数组中的元素个数
     * @return
     */
    int getSize(){
        return size;
    }

    /**
     * 判断数组是否为空
     * @return
     */
    boolean isEmpty(){
        return size == 0;
    }

    /**
     * 删除data[index]
     * @param index
     * @return
     */
    T remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("参数错误，请输入合法的数组下标");
        T temp = data[index];
        for(int i = index ; i < size;i++){
            data[i] = data[i+1];
        }
        size--;
        return temp;
    }


}
