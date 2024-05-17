package collection.set.member;

import java.util.Objects;

public class MemberNoHashEq {

    private String id;

    public MemberNoHashEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
