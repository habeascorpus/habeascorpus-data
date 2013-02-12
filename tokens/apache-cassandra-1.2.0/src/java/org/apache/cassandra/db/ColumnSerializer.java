package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataInput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataOutput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
FSReadError	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IColumnSerializer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
FileDataInput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
ByteBufferUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ColumnSerializer	TokenNameIdentifier
implements	TokenNameimplements
IColumnSerializer	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
DELETION_MASK	TokenNameIdentifier
=	TokenNameEQUAL
0x01	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
EXPIRATION_MASK	TokenNameIdentifier
=	TokenNameEQUAL
0x02	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
COUNTER_MASK	TokenNameIdentifier
=	TokenNameEQUAL
0x04	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
COUNTER_UPDATE_MASK	TokenNameIdentifier
=	TokenNameEQUAL
0x08	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
RANGE_TOMBSTONE_MASK	TokenNameIdentifier
=	TokenNameEQUAL
0x10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
serialize	TokenNameIdentifier
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
column	TokenNameIdentifier
,	TokenNameCOMMA
DataOutput	TokenNameIdentifier
dos	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
assert	TokenNameassert
column	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
writeWithShortLength	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
dos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
dos	TokenNameIdentifier
.	TokenNameDOT
writeByte	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
.	TokenNameDOT
serializationFlags	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
column	TokenNameIdentifier
instanceof	TokenNameinstanceof
CounterColumn	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
dos	TokenNameIdentifier
.	TokenNameDOT
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
CounterColumn	TokenNameIdentifier
)	TokenNameRPAREN
column	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
timestampOfLastDelete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
column	TokenNameIdentifier
instanceof	TokenNameinstanceof
ExpiringColumn	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
dos	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
ExpiringColumn	TokenNameIdentifier
)	TokenNameRPAREN
column	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getTimeToLive	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dos	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
.	TokenNameDOT
getLocalDeletionTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
dos	TokenNameIdentifier
.	TokenNameDOT
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
.	TokenNameDOT
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
writeWithLength	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
dos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Column	TokenNameIdentifier
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
dis	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
,	TokenNameCOMMA
Flag	TokenNameIdentifier
.	TokenNameDOT
LOCAL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Column	TokenNameIdentifier
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
dis	TokenNameIdentifier
,	TokenNameCOMMA
IColumnSerializer	TokenNameIdentifier
.	TokenNameDOT
Flag	TokenNameIdentifier
flag	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
,	TokenNameCOMMA
flag	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Column	TokenNameIdentifier
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
dis	TokenNameIdentifier
,	TokenNameCOMMA
IColumnSerializer	TokenNameIdentifier
.	TokenNameDOT
Flag	TokenNameIdentifier
flag	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
expireBefore	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
readWithShortLength	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
CorruptColumnException	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
b	TokenNameIdentifier
=	TokenNameEQUAL
dis	TokenNameIdentifier
.	TokenNameDOT
readUnsignedByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
deserializeColumnBody	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
,	TokenNameCOMMA
b	TokenNameIdentifier
,	TokenNameCOMMA
flag	TokenNameIdentifier
,	TokenNameCOMMA
expireBefore	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Column	TokenNameIdentifier
deserializeColumnBody	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
dis	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
mask	TokenNameIdentifier
,	TokenNameCOMMA
IColumnSerializer	TokenNameIdentifier
.	TokenNameDOT
Flag	TokenNameIdentifier
flag	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
expireBefore	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
mask	TokenNameIdentifier
&	TokenNameAND
COUNTER_MASK	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
timestampOfLastDelete	TokenNameIdentifier
=	TokenNameEQUAL
dis	TokenNameIdentifier
.	TokenNameDOT
readLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
ts	TokenNameIdentifier
=	TokenNameEQUAL
dis	TokenNameIdentifier
.	TokenNameDOT
readLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
readWithLength	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
CounterColumn	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
ts	TokenNameIdentifier
,	TokenNameCOMMA
timestampOfLastDelete	TokenNameIdentifier
,	TokenNameCOMMA
flag	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
mask	TokenNameIdentifier
&	TokenNameAND
EXPIRATION_MASK	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
ttl	TokenNameIdentifier
=	TokenNameEQUAL
dis	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
expiration	TokenNameIdentifier
=	TokenNameEQUAL
dis	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
ts	TokenNameIdentifier
=	TokenNameEQUAL
dis	TokenNameIdentifier
.	TokenNameDOT
readLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
readWithLength	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ExpiringColumn	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
ts	TokenNameIdentifier
,	TokenNameCOMMA
ttl	TokenNameIdentifier
,	TokenNameCOMMA
expiration	TokenNameIdentifier
,	TokenNameCOMMA
expireBefore	TokenNameIdentifier
,	TokenNameCOMMA
flag	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
long	TokenNamelong
ts	TokenNameIdentifier
=	TokenNameEQUAL
dis	TokenNameIdentifier
.	TokenNameDOT
readLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
readWithLength	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
mask	TokenNameIdentifier
&	TokenNameAND
COUNTER_UPDATE_MASK	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
new	TokenNamenew
CounterUpdateColumn	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
ts	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
mask	TokenNameIdentifier
&	TokenNameAND
DELETION_MASK	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
new	TokenNamenew
Column	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
ts	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
new	TokenNamenew
DeletedColumn	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
ts	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
column	TokenNameIdentifier
,	TokenNameCOMMA
TypeSizes	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
column	TokenNameIdentifier
.	TokenNameDOT
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
CorruptColumnException	TokenNameIdentifier
extends	TokenNameextends
IOException	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
CorruptColumnException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
CorruptColumnException	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
dis	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
name	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
format	TokenNameIdentifier
=	TokenNameEQUAL
"invalid column name length %d%s"	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
details	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
dis	TokenNameIdentifier
instanceof	TokenNameinstanceof
FileDataInput	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FileDataInput	TokenNameIdentifier
fdis	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FileDataInput	TokenNameIdentifier
)	TokenNameRPAREN
dis	TokenNameIdentifier
;	TokenNameSEMICOLON
long	TokenNamelong
remaining	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
remaining	TokenNameIdentifier
=	TokenNameEQUAL
fdis	TokenNameIdentifier
.	TokenNameDOT
bytesRemaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
FSReadError	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
fdis	TokenNameIdentifier
.	TokenNameDOT
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
details	TokenNameIdentifier
=	TokenNameEQUAL
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
" (%s, %d bytes remaining)"	TokenNameStringLiteral
,	TokenNameCOMMA
fdis	TokenNameIdentifier
.	TokenNameDOT
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
remaining	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
CorruptColumnException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
format	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
details	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
