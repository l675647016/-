package obs.observer1.subject;

import obs.observer1.observer.Observer;

/**
 * Created by 梁峻磊 on 2017/9/13.
 * 主题接口
 */
public interface Subject {
    //注册观察者
    public void registerObserver(Observer observer);

    //删除观察者
    public void removeObserver(Observer observer);

    //当主题改变，调用这个方法，通知所有观察者
    public void notifyObservers();
}
