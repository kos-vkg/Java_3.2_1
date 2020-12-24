package ru.netology.domain;

public class Post {
    private int id;
    private int idAuhtor; //ссылка  на информацию об авторе
    private String PostDate; // дата создания
    private String PostText; // текст сообщения
    private int idSource; // id записи, для которой данная запись является комментарием,
    // = 0 если нет.

    //private  CommentsInfo[] commentsInfo;  // предложено в задании

    /** не понимаю, зачем, кроме быстродействия, может быть нужен такой класс.
     *  По-моему, вся информация о комментариях, (например, количество комментариев)
     *  может быть найдена менеджером с помощью методов путем поиска
     *  по полю idSource в других постах.
     **/

}
