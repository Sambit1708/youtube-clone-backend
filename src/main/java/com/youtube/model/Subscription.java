package com.youtube.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "subscriptions")
public class Subscription extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subscriber_id")
    private User subscriber;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subscribed_to_id")
    private User subscribedTo;
}
