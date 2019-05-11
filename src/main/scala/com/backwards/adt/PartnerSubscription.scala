package com.backwards.adt

final case class PartnerSubscription(
  productId: ProductId,
  partnerSubscriptionId: PartnerSubscriptionId,
  partnerTransactionId: PartnerTransactionId,
  originalPurchaseDate: OriginalPurchaseDate,
  purchaseDate: PurchaseDate,
  expiresDate: Option[ExpiresDate]
)