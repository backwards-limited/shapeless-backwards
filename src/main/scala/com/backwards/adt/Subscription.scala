package com.backwards.adt

final case class Subscription(
  productId: ProductId,
  subscriptionId: SubscriptionId,
  transactionId: TransactionId,
  originalPurchaseDate: OriginalPurchaseDate,
  purchaseDate: PurchaseDate,
  expiresDate: Option[ExpiresDate]
)